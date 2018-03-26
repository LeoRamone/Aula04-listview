package com.example.leonardo_soares.listarpaises2;
import android.graphics.drawable.Drawable;
import android.content.Context;

import java.lang.reflect.Field;


/**
 * Created by leonardo_soares on 26/03/2018.
 * RA 816114026
 */
public class util {
    public static Drawable getDrawable(Context context, String nome){

        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(nome);
            int id = idField.getInt(idField);
            return context.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
