function solution(n, numlist) {
   let answer = [];
    for(var i=0; i<numlist.length; i++){
        if(numlist[i]%n==0){
            answer.push(numlist[i]);
        }
    }
    return answer;
}