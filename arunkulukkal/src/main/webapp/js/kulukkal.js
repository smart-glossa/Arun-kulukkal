$(document).on(
	    "click",
	    "#customer",
	    function() { 
	    	 var strVar = "";
    strVar += "<div id=\"addCustomers\">Add Customers<\/div>";
    strVar += "<div id=\"updateCustomers\">Update Customers<\/div>";
    strVar += "<div id=\"getAllCustomers\" onclick=\"allcustomer()\">get all<\/div>";
    strVar += "<div id=\"getOneCustomer\">Get One Customers<\/div>";
    var strVar = "";
    $("#import1")[0].innerHTML = strVar;
    
	    });
function addCustomer() {

    // div.innerHTML = table;

    var strVar = "";
    strVar += "<div id=\"addCustomers\">Add Customers<\/div>";
    strVar += "<div id=\"updateCustomers\">Update Customers<\/div>";
    strVar += "<div id=\"getAllCustomers\" onclick=\"allcustomer()\">get all<\/div>";
    strVar += "<div id=\"getOneCustomer\">Get One Customers<\/div>";
    strVar += "<div class=\"addcustomer\">";
    strVar += "<h1>Add Customers<\/h1>";
    strVar += "<table>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Token Number";
    strVar += "<\/td><td><input type=\"text\" id=\"sno\"><\/td><\/tr>";
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
    strVar += "<\/td><td><input type=\"text\" id=\"mnumber\" maxlength=\"10\"><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Prize Id";
    strVar += "<\/td><td><input type=\"text\" id=\"pid\"><\/td><\/tr>";
   
    strVar += "<tr><td><input type=\"button\" value=\"add\" id=\"add\"><\/input></td><\/tr>";
    strVar += "<\/table>";
    strVar += "<\/div>";
   
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

$(document).on(
	    "click",
	    "#updateCustomers",
	    function() {
    // div.innerHTML = table;

    var strVar = "";
    strVar += "<div class=\"addcustomer\">";
    strVar += "<h1>Update Customers<\/h1>";
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
    strVar += "<\/td><td><input type=\"text\" id=\"mnumber\" maxlength=\"10\"><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Prize Id";
    strVar += "<\/td><td><input type=\"text\" id=\"pid\"><\/td><\/tr>";
   
    strVar += "<tr><td><input type=\"button\" value=\"update\" id=\"update\"><\/input></td><\/tr>";
    strVar += "<\/table>";
    strVar += "<\/div>";
   
    strVar += "";
    $("#import")[0].innerHTML = strVar;

})
$(document).on(
	    "click",
	    "#update",
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
	        

	        var url = "/arunkulukkal/kulukkal?operation=updateCustomer&tno=" +
	            tno + "&pnumber= " + pnumber + " &name=" + name +
	            " &address=" + address + " &mnumber=" + mnumber +
	            "&pid=" + pid ;

	        $.ajax({
	            url: url,
	            type: 'POST'

	        }).done(function(result) {
	            alert(result);

	        })
	        .fail(function(result) {
	            alert(result);
	        });
	    });
$(document)
.on(
    'keyup',
    '#tno',
    function() {
        var tno = $('#tno').val();
        if (tno !== "") {

            var url = "/arunkulukkal/kulukkal?operation=getOneCustomer&tno=" +
                tno;
            $.ajax({
                url: url,
                type: 'POST'
            }).done(function(result) {
                var res = JSON.parse(result);
                $('#tno').val(res.tno);
                $('#pnumber').val(res.pnumber);
                $('#name').val(res.name);
                $('#address').val(res.address);
                $('#mnumber').val(res.mnumber);
                $('#pid').val(res.pid);
                
                var url1 = "/arunkulukkal/kulukkal?operation=getPrizes&tno=" +
                tno;
            $.ajax({
                url: url1,
                type: 'POST'
            }).done(function(result) {
            	result=JSON.parse(result);
            	var price=result.prizes;
                //var ress = JSON.parse(result);
                $('#prizes').val(price);
            }).fail(function(result) {
                alert(result);
            })
            }).fail(function(result) {
                alert(result);
            })
        } else {
        	 $('#pnumber').val("");
            $('#name').val("");
           
            $('#address').val("");
            $('#mnumber').val("");
            $('#pid').val("");
            $('#prizes').val("");
        }
    })
    function allcustomer() {
    var url = "/arunkulukkal/kulukkal?operation=getAllCustomer";
    $
        .ajax({
            url: url,
            type: 'POST'
        })
        .done(
            function(result) {
                var res = JSON.parse(result);
                var table = "<table  style='border: 1px solid black' >"
                table += "<tr><th>Token.No</th><th>Passbook.No</th><th>Name</th><th>Address</th><th>Mobile Number</th><th>Prize Number</th></tr>"
                for (var i = 0; i < res.length; i++) {

                    table += "<td>" + res[i].tno + "</td>"
                    table += "<td>" + res[i].pnumber + "</td>"
                    table += "<td>" + res[i].name + "</td>"
                    table += "<td>" + res[i].address + "</td>"
                    table += "<td>" + res[i].mnumber + "</td>"
                    table += "<td>" + res[i].pid + "</td>"
                   
                    table += "<td><img src='images/delete.jpg' class='delete' ></td></tr>";
                }
                table += "</table>";
                $("#import")[0].innerHTML = table;
            })
};


$(document).on(
	    "click",
	    "#getOneCustomer",
	    function() {
    // div.innerHTML = table;

    var strVar = "";
    strVar += "<div class=\"addcustomer\">";
    strVar += "<h1>Get One Customer<\/h1>";
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
    strVar += "<\/td><td><input type=\"text\" id=\"address\" ><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Mobile Number";
    strVar += "<\/td><td><input type=\"text\" id=\"mnumber\" maxlength=\"10\"><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Prize Id";
    strVar += "<\/td><td><input type=\"text\" id=\"pid\"><\/td><\/tr>";
    strVar += "<tr>";
    strVar += "<td>";
    strVar += "Prize";
    strVar += "<\/td><td><input type=\"text\" id=\"prizes\"><\/td><\/tr>";
   
   
    strVar += "<\/table>";
    strVar += "<\/div>";
   
    strVar += "";
    $("#import")[0].innerHTML = strVar;

})


