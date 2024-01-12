/* 
let ticketno = prompt("ENter the number of ticket:");
if(ticketno>10)
{
    alert("Only 10 ticket book at a time");
    let ticketno = prompt("ENter the number of ticket:");
    alert("Your ticket cost is: "+ticketno*200);
 
}
else if(ticketno>0 && ticketno<=10)
{
    alert("Your ticket cost is: "+ticketno*200);
    
}
else{
    alert("Invalid number");
    let ticketno = prompt("ENter the number of ticket:");
    alert("Your ticket cost is: "+ticketno*200);
} */
/* 
function userchecking()
{
    let name=document.getElementById("username").value;
    let pwd= document.getElementById("pass").value;
    if(name=="admin@gmail.com" && pwd=="reset@123")
    {
        alert("Welcome "+name);
    }
    else{
        alert("Invalid credentials");
    }
} */

function maths()
{
     num1 = parseInt(document.getElementById("num1").value);
     num2 = parseInt(document.getElementById("num2").value);
    oper = document.getElementsByName("opr");
    if(oper=='ADD')
    {
        alert(num1+num2);
    }
    else if(oper=='SUB')
    {
        alert(num1-num2);
    }
    else if(oper=='MUL')
    {
        alert(num1*num2);
    }
    else
    {
        alert(num1/num2);
    }
}