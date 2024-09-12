package com.example.city_Taxi.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseMessage {
        private int code;
        private String message;
        private Object object;

        public ResponseMessage(int code, String message, Object object) {
            this.code = code;
            this.message = message;
            this.object = object;
        }

    public ResponseMessage() {

    }
        @Override
        public String toString() {
            return "StandardResponse{" +
                    "code=" + code +
                    ", message='" + message + '\'' +
                    ", object=" + object +
                    '}';    }
    }