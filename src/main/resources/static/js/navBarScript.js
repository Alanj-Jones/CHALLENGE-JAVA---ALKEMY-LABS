function changeState() {
  var x = $(".navbar");
  var y = $("#menu");

  if (x.attr("class") === "navbar") {
    x.attr("class", "navbar responsive");
  } else {
    x.removeClass("responsive");
  }

  if (y.attr("class") === "logo-img") {
    y.attr("class", "logo-img none");
  } else {
    y.removeClass("none");
  }
}
