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
$(document).on(
	    "click",
	    "#add",
	    function() {

	        var tno = $("#tno").val();
	        var pnumber = $("#pnumber").val();
	        var name = $("#name").val();
	        var address = $("#address").val();
	        var mnumber = $("#mnumber").val();
	        var pid = $("#pid").val();
	        

	        if (tno == "") {
	            $("#tno").focus().css("outline-color", "red");
	            return;
	        }
	        if (pnumber == "") {
	            $("#pnumber").focus().css("outline-color", "red");
	            return;
	        }
	        if (name == "") {
	            $("#name").focus().css("outline-color", "red");
	            return;
	        }
	        if (address == "") {
	            $("#address").focus().css("outline-color", "red");
	            return;
	        }
	        if (mnumber == "") {
	            $("#mnumber").focus().css("outline-color", "red");
	            return;
	        }
	        if (pid == "") {
	            $("#pid").focus().css("outline-color", "red");
	            return;
	        }
	        

	        var url = "/arunkulukkal/kulukkal?operation=addCustomer&tno=" +
	            tno + "&pnumber= " + pnumber + " &name=" + name +
	            " &address=" + address + " &mnumber=" + mnumber +
	            "&pid=" + pid ;

	        $.ajax({
	            url: url,
	            type: 'POST'

	        }).done(function(result) {
	            alert(result);

	        })
	        fail(function(result) {
	            alert(result);
	        });
	    });