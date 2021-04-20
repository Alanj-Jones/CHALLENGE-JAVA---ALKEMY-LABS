function changeState() {
  var x = $(".navbar");
  console.log(x);
  if (x.attr("class") === "navbar") {
    x.attr("class", "navbar responsive");
    console.log(x);
  } else {
    x.removeClass("responsive");
  }
}
