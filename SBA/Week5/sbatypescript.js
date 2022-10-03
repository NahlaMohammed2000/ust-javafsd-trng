var Student = /** @class */ (function () {
    function Student(mark1, grade) {
        this.mark1 = mark1;
        this.grade = grade;
    }
    Student.prototype.Calculate = function () {
        if (this.mark1 > 90) {
            console.log("Well done, Grade is: " + this.grade);
        }
        else {
            console.log("Grade is: " + this.grade);
        }
    };
    return Student;
}());
var cnt = 0;
var arr_names1 = new Array(4);
for (var i = 0; i < arr_names1.length; i++) {
    arr_names1[i] = i + 10;
    console.log(arr_names1[i]);
}
var obj1 = new Student(50, "B");
obj1.Calculate();
for (var j = 0; j < arr_names1.length; j++) {
    if (obj1.mark1 == arr_names1[j]) {
        cnt = 1;
    }
    else {
        cnt = 0;
    }
}
if (cnt == 1) {
    console.log("Mark present in array");
}
else {
    console.log("Mark not present in array");
}
