package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class z {
    private z() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.animation.keyframe.i a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean z3;
        if (jsonReader.v() == JsonReader.Token.BEGIN_OBJECT) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new com.airbnb.lottie.animation.keyframe.i(gVar, t.c(jsonReader, gVar, com.airbnb.lottie.utils.j.e(), A.f21855a, z3, false));
    }
}
