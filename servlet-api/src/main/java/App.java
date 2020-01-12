import com.QuotesServlet;
import org.eclipse.jetty.server.handler.ContextHandler;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class App {

    public static Server createServer(int port)
    {
        Server server = new Server(port);

        // Add a single handler on context "/hello"
        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");
        context.addServlet(new ServletHolder(new QuotesServlet()), "/api/v0/quotes");
        server.setHandler(context);

        return server;
    }

    public static void main(String[] args) throws Exception
    {
        Server server = createServer(8080);
        server.start();
        server.join();
    }
    }