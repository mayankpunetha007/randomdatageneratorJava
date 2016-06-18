package com.random.generator;

import com.random.generator.spec.Generator;

import java.util.Random;

/**
 * Created by Mayank Punetha on 13-06-2016.
 */
public class ByteArrayGenerator implements Generator {

    Random r = new Random();
    /**
     * @return
     */
    public Object generateRandom(final int maxLength,final String condition){
        final int limit = r.nextInt()%maxLength;
        byte[] result = new byte[limit];
        r.nextBytes(result);
        return result;
    }

    public Object generateRandom(){
        final int limit = r.nextInt();
        return generateRandom(limit,"NONE");
    }

}
