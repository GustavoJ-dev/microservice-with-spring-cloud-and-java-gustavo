package com.gustavojdev.api.math;

import com.gustavojdev.api.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.gustavojdev.api.request.converters.NumberConverters.convertToDouble;
import static com.gustavojdev.api.request.converters.NumberConverters.isNumeric;

public class SimpleMath {


    public Double sum(Double numberOne, Double numberTwo)  {


        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo)  {


        return numberOne - numberTwo;
    }

    public Double multiply(Double numberOne, Double numberTwo)  {


        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo)  {


        return numberOne / numberTwo;
    }

    public Double squareRoot(Double numberOne)  {


        return Math.sqrt(numberOne);
    }

    public Double media(Double numberOne, Double numberTwo)  {


        return (numberOne + numberTwo) / 2;
    }






}
