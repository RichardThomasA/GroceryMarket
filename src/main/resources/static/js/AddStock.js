window.onload = (loadEvent) =>{
    fetch ("/itemCategory/")
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
            
        let jsonlength = facultyObject.length;
        console.log(jsonlength);
        for(var index in facultyObject){
            console.log(index);
            console.log(facultyObject[index].itemCategoryId);
            console.log(facultyObject[index].itemCategoryName)
            let itemCatId = facultyObject[index].itemCategoryId;
            let itemCatName = facultyObject[index].itemCategoryName;
            document.getElementById("itemCategory").options.add(new Option(itemCatName,itemCatId));
        }

            
    });
    fetch ("/Vendor/listVendors")
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
            
        let jsonlength = facultyObject.length;
        console.log(jsonlength);
        for(var index in facultyObject){
            console.log(index);
            console.log(facultyObject[index].vendorId);
            console.log(facultyObject[index].vendorName)
            let venId = facultyObject[index].vendorId;
            let venName = facultyObject[index].vendorName;
            document.getElementById("vendor").options.add(new Option(venName,venId));
        }

            
    });
    fetch ("/StockItem/UnitOfQuantity")
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
            document.getElementById("unitOfQuantity").options.add(new Option(key,value));
        }
    });
}