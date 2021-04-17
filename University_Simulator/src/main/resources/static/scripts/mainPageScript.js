$(document).ready(() => {
  $("#adminLogIn").css("display", "none");
});

const checkOption = () => {
  if ($("#selector").val() === "student") {
    $("#adminLogIn").css("display", "none");
    $("#studentLogIn").css("display", "block");
    return;
  }
  $("#studentLogIn").css("display", "none");
  $("#adminLogIn").css("display", "block");
};
