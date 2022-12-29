
var venCatObjects;

window.onload = (loadEvent) =>{
    fetch ("/vendorCategory/")
    .then(response => response.json())
    .then(jsonData => {
            //convet to json object
            var jsonObject = JSON.stringify(jsonData);
            console.log(jsonObject);
            //convert to json array
            var facultyObject =JSON.parse(jsonObject);
            console.log(facultyObject);
            // const map = new Map(Object.entries(facultyObject));
            // console.log(map);
            
            venCatObjects = facultyObject;
            let jsonlength = facultyObject.length;
            console.log(jsonlength);
            for(var index in facultyObject){
                console.log(index);
                console.log(facultyObject[index].vendorCategoryId);
                console.log(facultyObject[index].vendorCategoryName)
                let venCatName = facultyObject[index].vendorCategoryName;
                document.getElementById("vendorCategoryName").options.add(new Option(venCatName,venCatName));
            }

            // const keyIterator = map.keys();
            // const valueIterator = map.values();
            // for( var i = 0;i<map.size; i++){
            //     var value = valueIterator.next().value;
            //     var key = keyIterator.next().value;
            //     document.getElementById("vendorCategoryName").options.add(new Option(value,key));
            // }
        });
    fetch ("/Vendor/UserTypes")
    .then(response => response.json())
    .then(jsonData => {
            //convet to json object
            var jsonObject = JSON.stringify(jsonData);
            console.log(jsonObject);
            //convert to json array
            var facultyObject =JSON.parse(jsonObject);
            console.log(facultyObject);
            const map = new Map(Object.entries(facultyObject));
            console.log(map);
            

            const keyIterator = map.keys();
            const valueIterator = map.values();
            for( var i = 0;i<map.size; i++){
                var value = valueIterator.next().value;
                var key = keyIterator.next().value;
                document.getElementById("vendorUserType").options.add(new Option(value,key));
            }
        });
}


document.getElementById("vendorCategoryName").onchange = function onVendorCategoryChange(){

    console.log(venCatObjects);
    for(var index in venCatObjects){
        
        let selectValue = document.getElementById("vendorCategoryName").value;
        //console.log(index);
        //console.log(selectValue);
        if(venCatObjects[index].vendorCategoryName==selectValue){
            document.getElementById("vendorCategoryId").value = venCatObjects[index].vendorCategoryId;
            console.log(venCatObjects[index].vendorCategoryId);
            console.log("all set")
        }
    }
};