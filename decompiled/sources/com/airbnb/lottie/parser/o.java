package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class o implements M<com.airbnb.lottie.model.content.d> {

    /* renamed from: a, reason: collision with root package name */
    private int f21985a;

    public o(int i4) {
        this.f21985a = i4;
    }

    private void b(com.airbnb.lottie.model.content.d dVar, List<Float> list) {
        int i4 = this.f21985a * 4;
        if (list.size() <= i4) {
            return;
        }
        int size = (list.size() - i4) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i5 = 0;
        while (i4 < list.size()) {
            if (i4 % 2 == 0) {
                dArr[i5] = list.get(i4).floatValue();
            } else {
                dArr2[i5] = list.get(i4).floatValue();
                i5++;
            }
            i4++;
        }
        for (int i6 = 0; i6 < dVar.c(); i6++) {
            int i7 = dVar.a()[i6];
            dVar.a()[i6] = Color.argb(c(dVar.b()[i6], dArr, dArr2), Color.red(i7), Color.green(i7), Color.blue(i7));
        }
    }

    @androidx.annotation.F(from = 0, to = 255)
    private int c(double d4, double[] dArr, double[] dArr2) {
        double d5;
        int i4 = 1;
        while (true) {
            if (i4 < dArr.length) {
                int i5 = i4 - 1;
                double d6 = dArr[i5];
                double d7 = dArr[i4];
                if (d7 >= d4) {
                    d5 = com.airbnb.lottie.utils.i.j(dArr2[i5], dArr2[i4], com.airbnb.lottie.utils.i.b((d4 - d6) / (d7 - d6), com.google.firebase.remoteconfig.l.f37524n, 1.0d));
                    break;
                }
                i4++;
            } else {
                d5 = dArr2[dArr2.length - 1];
                break;
            }
        }
        return (int) (d5 * 255.0d);
    }

    @Override // com.airbnb.lottie.parser.M
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d a(JsonReader jsonReader, float f4) throws IOException {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            jsonReader.b();
        }
        while (jsonReader.i()) {
            arrayList.add(Float.valueOf((float) jsonReader.k()));
        }
        if (z3) {
            jsonReader.d();
        }
        if (this.f21985a == -1) {
            this.f21985a = arrayList.size() / 4;
        }
        int i4 = this.f21985a;
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f21985a * 4; i7++) {
            int i8 = i7 / 4;
            double floatValue = arrayList.get(i7).floatValue();
            int i9 = i7 % 4;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            iArr[i8] = Color.argb(255, i5, i6, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i6 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i5 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i8 > 0) {
                    float f5 = (float) floatValue;
                    if (fArr[i8 - 1] >= f5) {
                        fArr[i8] = f5 + 0.01f;
                    }
                }
                fArr[i8] = (float) floatValue;
            }
        }
        com.airbnb.lottie.model.content.d dVar = new com.airbnb.lottie.model.content.d(fArr, iArr);
        b(dVar, arrayList);
        return dVar;
    }
}
