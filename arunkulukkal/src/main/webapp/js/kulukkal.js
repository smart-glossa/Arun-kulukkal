function addCustomer() {

    // div.innerHTML = table;

    var strVar = "";
    strVar += "<div class=\"addcustomer\">";
    strVar += "<h1>Add Customers<\/h1>";
    strVar += "<table>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Token Number";
    strVar += "<\/td><td><input type=\"text\" id=\"tno\"><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Pass Book Number";
    strVar += "<\/td><td><input type=\"text\" id=\"pnumber\"><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "name";
    strVar += "<\/td><td><input type=\"text\" id=\"name\"><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Address";
    strVar += "<\/td><td><input type=\"text\" id=\"address\" maxlength=\"10\"><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Mobile Number";
    strVar += "<\/td><td><input type=\"text\" id=\"mnumber\"><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Prize Id";
    strVar += "<\/td><td><input type=\"text\" id=\"pid\"><\/td><\/tr>";
   
    strVar += "<tr><td><input type=\"button\" value=\"add\" id=\"add\"><\/input></td><\/tr>";
    strVar += "<\/table>";
    strVar += "<\/div>";
    strVar += "<div id=\"updateCustomers\">Update Customers<\/div>";
    strVar += "<div id=\"getAllCustomers\">View All Customers<\/div>";
    strVar += "<div id=\"getOneCustomer\">Get One Customers<\/div>";
    strVar += "";
    $("#import")[0].innerHTML = strVar;

}
