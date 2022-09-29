
getISS();

async function getISS(){

    try{
        const api_url = 'https://api.wheretheiss.at/v1/satellites/25544';
        const response = await fetch(api_url);
        const spaceData = await response.json();
        console.log(spaceData);
        const {latitude, longitude} = spaceData;
        console.log(latitude);
        console.log(longitude);
        document.getElementById('lat').innerText = latitude;
        document.getElementById('lon').innerText = longitude;
    }catch (e) {
        console.log(e);
    }
}



