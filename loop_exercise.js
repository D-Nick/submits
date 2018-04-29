//this was an exercise from The Complete Javacript Course by Jonas Schmedtmann on Udemy

var testArray = [1999, 1980, 1974, 1955];
//just testing transfer of elements or array from one to another
var empty = []
var i = 0;
while (i<testArray.length){
	empty[i] = testArray [i];
	i++;	
	console.log(empty);
}

//Using 2016 as the year, transfer ages to array age
var i = 0;
var age = []
while (i<empty.length){
	age[i] = 2016 - empty[i];
	i++;	
	console.log(age);
}

//loop through age array, and see if their age is less than 18
var i = 0;
while(i<age.length){
	i++;
	if (age[i]<18){
		console.log(age[i] + ' is under 18');
	}else{
		console.log(age[i] + ' is above 18');
	}
	
}
//recreate using a function, true for above 18, false for below 18
function printFullAge(agesList) {
	var i = 0;
	var age = [];
while (i<agesList.length){
	age[i] = 2016 - agesList[i];
	i++;
	if(age[i]<18){
		agesList[i] = false;
	}else{
		agesList[i] = true;
	}
	
}
	console.log(agesList);
}
//store in variables
full_1 = printFullAge([1990, 2009, 2000, 1934]);

full_2 = printFullAge([1967, 1945, 1999])
