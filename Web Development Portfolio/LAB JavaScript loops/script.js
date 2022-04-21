function drawTriangle(size) {

   // Your solution goes here
    var i;
    var j;
	 var result = "";
    for(i = 1; i <= size; i++) {
      for(j = 1; j <= i; j++) {
        result += "*";
      }
	  result += "\n";
    }
	console.log(result);
}