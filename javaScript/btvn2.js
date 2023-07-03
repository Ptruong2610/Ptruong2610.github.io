const grades = [
    { name: 'John', grade: 8, sex: 'M' },
    { name: 'Sarah', grade: 12, sex: 'F' },
    { name: 'Bob', grade: 16, sex: 'M' },
    { name: 'Johnny', grade: 2, sex: 'M' },
    { name: 'Ethan', grade: 4, sex: 'M' },
    { name: 'Paula', grade: 18, sex: 'F' },
    { name: 'Donald', grade: 5, sex: 'M' },
    { name: 'Jennifer', grade: 13, sex: 'F' },
    { name: 'Courtney', grade: 15, sex: 'F' },
    { name: 'Jane', grade: 9, sex: 'F' }
]

const averageGrade = (grades) => {
    let sum = 0;
    for (let i = 0; i < grades.length; i++) {
        sum += grades[i].grade;
    }
    return sum / grades.length;
}
console.log(averageGrade(grades));

const averageMaleGrade = (grades) => {
    let sum = 0;
    let count = 0;
    for (let i = 0; i < grades.length; i++) {
        if (grades[i].sex === 'M') {
            sum += grades[i].grade;
            count++;
        }
    }
    return sum / count;
}
console.log(averageMaleGrade(grades));

const averageFemaleGrade = (grades) => {
    let sum = 0;
    let count = 0;
    for (let i = 0; i < grades.length; i++) {
        if (grades[i].sex === "F") {
            sum += grades[i].grade;
            count++;
        }
    }
    return sum / count;
}
console.log(averageFemaleGrade(grades));

const findBestMaleGrade = (grades) => {
    let bestMaleGrade = null;
    let temp = 0;
    for (let i = 0; i < grades.length; i++) {
        if (grades[i].sex === "M" && grades[i].grade > temp) {
            temp = grades[i].grade;
            bestMaleGrade = grades[i].name;
        }
    }
    return bestMaleGrade;
}
console.log(findBestMaleGrade(grades));

const findBestFemaleGrade = (grades) => {
    let bestFemaleGrade = null;
    let temp = 0;
    for (let i = 0; i < grades.length; i++) {
        if (grades[i].sex === "F" && grades[i].grade > temp) {
            temp = grades[i].grade;
            bestFemaleGrade = grades[i].name;
        }
    }
    return bestFemaleGrade;
}
console.log(findBestFemaleGrade(grades));

const findLowestMaleGrade = (grades) => {
    let lowestMaleGrade = null;
    let temp = Infinity;
    for (let i = 1; i < grades.length; i++) {
        if (grades[i].sex === "M" && grades[i].grade < temp) {
            temp = grades[i].grade;
            lowestMaleGrade = grades[i].name;
        }
    }
    return lowestMaleGrade;
}
console.log(findLowestMaleGrade(grades));

const findLowestFemaleGrade = (grades) => {
    let lowestFemaGrade = null;
    let temp = Infinity;
    for (let i = 1; i < grades.length; i++) {
        if (grades[i].sex === "F" && grades[i].grade < temp) {
            temp = grades[i].grade;
            lowestFemaGrade = grades[i].name;
        }
    }
    return lowestFemaGrade;
}
console.log(findLowestFemaleGrade(grades));

const findBestGrade = (grades) => {
    let bestGrade = null;
    let temp = 0;
    for (let i = 0; i < grades.length; i++) {
        if (grades[i].grade > temp) {
            temp = grades[i].grade;
            bestGrade = grades[i].name;
        }
    }
    return bestGrade;
}
console.log(findBestGrade(grades));

const fineLowestGrade = (grades) => {
    let lowestGrade = null;
    let temp = Infinity;
    for (let i = 0; i < grades.length; i++) {
        if (grades[i].grade < temp) {
            temp = grades[i].grade;
            lowestGrade = grades[i].name;
        }
    }
    return lowestGrade;
}
console.log(fineLowestGrade(grades));

const slectFemaleGrade = (grades) => {
    let femal = [];
    for (let i = 0; i < grades.length; i++) {
        if (grades[i].sex === "F") {
            femal.push(grades[i]);
        }
    }
    return femal;
}
console.log(slectFemaleGrade(grades));

const sortStudentsByName = (grades) => {
    // grades.sort((sv1, sv2) => {
    //     let a = sv1.name.toLowerCase();
    //     let b = sv2.name.toLowerCase();
    //     return a === b ? 0 : a > b ? 1 : -1;
    // });
    // return grades;
    grades.sort((a, b) => {
        if (a.name < b.name) {
            return -1;
        }
        if (a.name > b.name) {
            return 1;
        }
        return 0;
    });
    return grades;
}
console.log(sortStudentsByName(grades));

// const sortLowestGrand = (grades) =>{
//     let temp ;
//     for(let i=0; i<grades.length-1; i++){
//         for(let j=i+1 ; j<grades.length;j++){
//             if(grades[i].grade < grades[j].grade){
//                 temp = grades[j];
//                 grades[j] = grades[i];
//                 grades[i] = temp;
//             }
//         }
//     }
//     return grades;
// }
// console.log(sortLowestGrand(grades));

const sortGradesDescending = (grades) => {
    grades.sort((a, b) => b.grade - a.grade);
    return grades;
}
console.log(sortGradesDescending(grades));

const filterFemaleStudentsWithJ = (grades) => {
    const filteredGrades = grades.filter(grades =>
        grades.sex === 'F' && grades.name.startsWith('J')
    );
    return filteredGrades;
}
console.log(filterFemaleStudentsWithJ(grades));

const getTop5Students = (grades) => {
    let top5Students = sortGradesDescending(grades); 
    return top5Students.slice(0, 5);
}
console.log(getTop5Students(grades));

