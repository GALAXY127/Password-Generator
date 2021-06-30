



function Generate(length: number) {
 let Password = "";
 for(let i = 0; i < length; i++) {
    Password += String.fromCharCode(Math.floor(Math.random() * (127-32) + 32));
 }
 return Password;

}


