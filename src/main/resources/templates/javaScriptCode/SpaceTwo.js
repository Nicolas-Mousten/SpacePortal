getSpaceListe();

async function getSpaceListe(){

    const url_list = 'https://api.spacexdata.com/v2/launches';
    const response = await fetch(url_list);
    const data = await response.json();

    const spaceList = Array.from(data);

    console.log(spaceList);

    let table1 = document.getElementById("table1");

    table1.innerHTML += `<tr>
    <th>Flight number</th>
    <th>Mission name</th>
    <th>Mission id</th>
     <th>launch year</th>
    <th>launch date local</th>
    
</tr>`;



    for(let i = 0; i< spaceList.length; i++){
        table1.innerHTML += "<tr>" +
            "<td>" + spaceList[i].flight_number + "</td>" +
            "<td>" + spaceList[i].mission_name + "</td>" +
            "<td>" + spaceList[i].mission_id + "</td>" +
            "<td>" + spaceList[i].launch_year + "</td>" +
            "<td>" + spaceList[i].launch_date_local + "</td>" +

            "</tr>"
    }
}