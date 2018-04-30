var fizzBuzz=require("./fizzbuzz");
describe('FizzBuzz', function(){
  it('should return 1 if input is 1', function(){
    expect(fizzBuzz.getResult(1)).toEqual("1");
  });
  it('should return 2 if input is 2', function(){
    expect(fizzBuzz.getResult(2)).toEqual("2")
  });
  it('should return fizz if input is multiple of 3',function(){
   expect(fizzBuzz.getResult(3)).toEqual("fizz");
  });
  it('should return buzz if input is multiple of 5', function(){
    expect(fizzBuzz.getResult(5)).toEqual("buzz");
  });
  it('should return fizzbuzz if input is multiple of 5 and 3', function(){
    expect(fizzBuzz.getResult(15)).toEqual("fizzbuzz");
  });
});
