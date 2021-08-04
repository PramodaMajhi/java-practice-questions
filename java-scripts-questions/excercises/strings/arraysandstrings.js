 function reverseString(str) {
  var a = str.split('');
  let l = a.length;
  console.log(l);
  for(let i=0; i < l/2; i++ ) {
    let temp = a[i];
    a[i] = a[l-i-1];
    console.log(a[i]);
    a[l-i-1] = temp;
  }
  console.log(a.join(""));
  return a.join("");
}
// reverseString("arka");
// Given two strings, write a method to decide if one is permutation of other
// abcd dabc
function permutationOfOther(str1, str2) {
  
}
 