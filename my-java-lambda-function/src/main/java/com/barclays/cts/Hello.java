package com.barclays.cts;

import com.amazonaws.services.lambda.runtime.Context;

public class Hello {
  public String myHandler(Context context) {
    return "Hello, Barclays - from my Java function. Served from S3.";
  }
}
