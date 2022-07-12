package com.gitcodings.stack.spring;

import com.gitcodings.stack.core.error.ResultError;
import com.gitcodings.stack.core.result.BasicResults;
import com.gitcodings.stack.spring.model.response.ResultBasicResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



public class detail {
    @GetMapping("/result/sum")
    public ResponseEntity<ResultBasicResponse> detail(
            @RequestParam("numX") Integer numX,
            @RequestParam("numY") Integer numY)
    {
        if (numX < 0 || numY < 0) {
            throw new ResultError(BasicResults.DATA_CONTAINS_INVALID_INTEGERS);
        }
        ResultBasicResponse response = new ResultBasicResponse()
                .setResult(BasicResults.CALCULATION_SUCCESSFUL)
                .setSum(numX + numY);

        return response.toResponse();
    }
}