//Node JS er en JavaScript runtime

'use strict'

const fs = require('fs');

const express = require('express');

const cors = require('cors');

const app = express();

const HTTP_PORT = parseInt(process.env.HTTP_PORT) || 8080;

//Calls the planets javascript code
app.get('/api/v1/planets', cors(), (req, res) => createResponse('../json/planets.json', res));

app.get('/api/v1/spaceships', cors(), (req, res) => createResponse('../json/spaceships.json' , res));

app.get('/api/v1/customers', cors(), (req, res) => createResponse('../json/customers.json', res));

app.get('/api/v1/reservations', cors(), (req, res) => createResponse('../json/reservations.json', res));

/**
 * Creates a response for a given local jason file.
 * @param {*} jsonFile
 * @param {*} res
 */
function createResponse(jsonFile, res) {
    res.setHeader('Content-Type', 'application/json');
    fs.readFile(jsonFile, 'utf-8', (err, data) => {
        let json = JSON.parse(data);
        console.log(JSON.stringify(json));
        res.json(json);
    })
}

app.listen(HTTP_PORT, () => console.log(`HTTP server listening at http://localhost:${HTTP_PORT}`));