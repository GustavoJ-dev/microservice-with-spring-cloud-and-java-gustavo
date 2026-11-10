package com.gustavojdev.api.controllers;

import com.gustavojdev.api.exception.UnsupportedMathOperationException;
import com.gustavojdev.api.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.gustavojdev.api.request.converters.NumberConverters.*;


@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath  simpleMath = new SimpleMath();

    //http://localhost:8080/math/sum/8/9
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please send a numeric value!");

        return simpleMath.sum(convertToDouble(numberOne),
                convertToDouble(numberTwo));
    }


    //http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please send a numeric value!");

        return simpleMath.subtraction(convertToDouble(numberOne),
                convertToDouble(numberTwo));
    }
    
    //http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable("numberOne") String numberOne,
                              @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please send a numeric value!");

        return simpleMath.division(convertToDouble(numberOne),
                convertToDouble(numberTwo));
    }
    
    
    //http://localhost:8080/math/multiply/3/5
    @RequestMapping("/multiply/{numberOne}/{numberTwo}")
    public Double multiply(@PathVariable("numberOne") String numberOne,
                              @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please send a numeric value!");

        return simpleMath.multiply(convertToDouble(numberOne),
                convertToDouble(numberTwo));
    }


    //http://localhost:8080/math/squareroot/25
    @RequestMapping("/squareroot/{numberOne}")
    public Double squareRoot(@PathVariable("numberOne") String numberOne) throws Exception {

        if (!isNumeric(numberOne)) throw new UnsupportedMathOperationException("Please send a numeric value!");

        return simpleMath.squareRoot(convertToDouble(numberOne));

    }

    //http://localhost:8080/math/media/3/5
    @RequestMapping("/media/{numberOne}/{numberTwo}")
    public Double media(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please send a numeric value!");

        return simpleMath.media(convertToDouble(numberOne),
                convertToDouble(numberTwo));
    }



}
