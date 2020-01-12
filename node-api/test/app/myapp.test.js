'use strict'
const request = require('supertest');
const app = require('../../app/myapp.js');
const chai = require('chai');
var assert = chai.assert;


describe ("Testing endpoints on  myapp.js with superset  ",function(){
    it("provided path variable is equal to the return response",function(done){
        request(app)
        .get('/query/mydata/')
        .expect(200)
        .then(response => {
            console.log(response.text);
            assert.equal(response.text, "mydata");
            done()
        })

     })
})