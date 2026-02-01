package com.airbnb.lottie.parser;

import androidx.annotation.P;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1019k {

    /* renamed from: f, reason: collision with root package name */
    private static final JsonReader.a f21886f = JsonReader.a.a("ef");

    /* renamed from: g, reason: collision with root package name */
    private static final JsonReader.a f21887g = JsonReader.a.a("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.a f21888a;

    /* renamed from: b, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f21889b;

    /* renamed from: c, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f21890c;

    /* renamed from: d, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f21891d;

    /* renamed from: e, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f21892e;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0052, code lost:
    
        if (r0.equals("Opacity") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.airbnb.lottie.parser.moshi.JsonReader r6, com.airbnb.lottie.g r7) throws java.io.IOException {
        /*
            r5 = this;
            r6.c()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.i()
            if (r1 == 0) goto L90
            com.airbnb.lottie.parser.moshi.JsonReader$a r1 = com.airbnb.lottie.parser.C1019k.f21887g
            int r1 = r6.A(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.D()
            r6.F()
            goto L5
        L1d:
            r0.hashCode()
            int r1 = r0.hashCode()
            r3 = 0
            r4 = -1
            switch(r1) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = r4
            goto L5f
        L2b:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5e
            goto L29
        L5e:
            r2 = r3
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.F()
            goto L5
        L66:
            com.airbnb.lottie.model.animatable.b r1 = com.airbnb.lottie.parser.C1012d.e(r6, r7)
            r5.f21892e = r1
            goto L5
        L6d:
            com.airbnb.lottie.model.animatable.a r1 = com.airbnb.lottie.parser.C1012d.c(r6, r7)
            r5.f21888a = r1
            goto L5
        L74:
            com.airbnb.lottie.model.animatable.b r1 = com.airbnb.lottie.parser.C1012d.f(r6, r7, r3)
            r5.f21890c = r1
            goto L5
        L7b:
            com.airbnb.lottie.model.animatable.b r1 = com.airbnb.lottie.parser.C1012d.f(r6, r7, r3)
            r5.f21889b = r1
            goto L5
        L82:
            com.airbnb.lottie.model.animatable.b r1 = com.airbnb.lottie.parser.C1012d.e(r6, r7)
            r5.f21891d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.p()
            goto L5
        L90:
            r6.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.C1019k.a(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.g):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public C1018j b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.b bVar3;
        com.airbnb.lottie.model.animatable.b bVar4;
        while (jsonReader.i()) {
            if (jsonReader.A(f21886f) != 0) {
                jsonReader.D();
                jsonReader.F();
            } else {
                jsonReader.b();
                while (jsonReader.i()) {
                    a(jsonReader, gVar);
                }
                jsonReader.d();
            }
        }
        com.airbnb.lottie.model.animatable.a aVar = this.f21888a;
        if (aVar != null && (bVar = this.f21889b) != null && (bVar2 = this.f21890c) != null && (bVar3 = this.f21891d) != null && (bVar4 = this.f21892e) != null) {
            return new C1018j(aVar, bVar, bVar2, bVar3, bVar4);
        }
        return null;
    }
}
