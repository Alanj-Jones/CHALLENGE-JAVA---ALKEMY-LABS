$(document).ready(() => {
  // $("#adminLogIn").css("display", "none");
  checkOption();
});

const checkOption = () => {
  if ($("#selector").val() === "student") {
    $("#adminLogIn").css("display", "none");
    //Atributos para el form de alumnos
    $("#studLabelUser").attr("for","username");
    $("#studLabelPass").attr("for","password");
    $("#studInputUser").attr("name","username");
    $("#studInputPass").attr("name","password");    
    //Remocion de atributos al form de Admin
    $("#adminLabelUser").removeAttr("for");
    $("#adminLabelPass").removeAttr("for");
    $("#adminInputUser").removeAttr("name");
    $("#adminInputPass").removeAttr("name");    

    $("#studentLogIn").css("display", "block");
    return;
  }
  //Remocion de atributos al form de alumnos
  $("#studLabelUser").removeAttr("for");
  $("#studLabelPass").removeAttr("for");
  $("#studInputUser").removeAttr("name");
  $("#studInputPass").removeAttr("name");
  //Atributos para el formulario de admin
  $("#adminLabelUser").attr("for","username");
  $("#adminLabelPass").attr("for","password");
  $("#adminInputUser").attr("name","username");
  $("#adminInputPass").attr("name","password"); 

  $("#studentLogIn").css("display", "none");
  $("#adminLogIn").css("display", "block");
};
