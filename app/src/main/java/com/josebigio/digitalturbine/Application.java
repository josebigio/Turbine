package com.josebigio.digitalturbine;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * <h1>Application</h1>
 */
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
