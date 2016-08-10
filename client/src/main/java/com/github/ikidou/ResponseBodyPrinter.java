/*
 * Copyright 2016 ikidou
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.ikidou;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;

public class ResponseBodyPrinter {
    /**
     * 为了方保证执行的顺序，所以方法是同步的
     */
    public static void printResponseBody(Call<ResponseBody> call) {
        try {
            System.out.println(call.execute().body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
