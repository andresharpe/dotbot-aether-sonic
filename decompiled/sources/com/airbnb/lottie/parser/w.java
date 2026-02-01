package com.airbnb.lottie.parser;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.spotify.sdk.android.auth.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f22004a = JsonReader.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    static JsonReader.a f22005b = JsonReader.a.a(b.c.f48986a, "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    private static final JsonReader.a f22006c = JsonReader.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    private static final JsonReader.a f22007d = JsonReader.a.a("cm", "tm", "dr");

    public static com.airbnb.lottie.g a(JsonReader jsonReader) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        JsonReader jsonReader2 = jsonReader;
        float e4 = com.airbnb.lottie.utils.j.e();
        androidx.collection.h<Layer> hVar = new androidx.collection.h<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        androidx.collection.m<com.airbnb.lottie.model.c> mVar = new androidx.collection.m<>();
        com.airbnb.lottie.g gVar = new com.airbnb.lottie.g();
        jsonReader.c();
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (jsonReader.i()) {
            switch (jsonReader2.A(f22004a)) {
                case 0:
                    i4 = jsonReader.m();
                    continue;
                case 1:
                    i5 = jsonReader.m();
                    continue;
                case 2:
                    f4 = (float) jsonReader.k();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f5 = ((float) jsonReader.k()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f6 = (float) jsonReader.k();
                    break;
                case 5:
                    String[] split = jsonReader.p().split("\\.");
                    if (com.airbnb.lottie.utils.j.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        break;
                    } else {
                        gVar.a("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                case 6:
                    e(jsonReader2, gVar, arrayList2, hVar);
                    continue;
                case 7:
                    b(jsonReader2, gVar, hashMap2, hashMap3);
                    continue;
                case 8:
                    d(jsonReader2, hashMap4);
                    continue;
                case 9:
                    c(jsonReader2, gVar, mVar);
                    continue;
                case 10:
                    f(jsonReader2, arrayList3);
                    continue;
                default:
                    jsonReader.D();
                    jsonReader.F();
                    continue;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        gVar.w(new Rect(0, 0, (int) (i4 * e4), (int) (i5 * e4)), f4, f5, f6, arrayList2, hVar, hashMap2, hashMap3, mVar, hashMap4, arrayList3);
        return gVar;
    }

    private static void b(JsonReader jsonReader, com.airbnb.lottie.g gVar, Map<String, List<Layer>> map, Map<String, com.airbnb.lottie.k> map2) throws IOException {
        jsonReader.b();
        while (jsonReader.i()) {
            ArrayList arrayList = new ArrayList();
            androidx.collection.h hVar = new androidx.collection.h();
            jsonReader.c();
            int i4 = 0;
            int i5 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.i()) {
                int A3 = jsonReader.A(f22005b);
                if (A3 != 0) {
                    if (A3 != 1) {
                        if (A3 != 2) {
                            if (A3 != 3) {
                                if (A3 != 4) {
                                    if (A3 != 5) {
                                        jsonReader.D();
                                        jsonReader.F();
                                    } else {
                                        str3 = jsonReader.p();
                                    }
                                } else {
                                    str2 = jsonReader.p();
                                }
                            } else {
                                i5 = jsonReader.m();
                            }
                        } else {
                            i4 = jsonReader.m();
                        }
                    } else {
                        jsonReader.b();
                        while (jsonReader.i()) {
                            Layer b4 = v.b(jsonReader, gVar);
                            hVar.p(b4.d(), b4);
                            arrayList.add(b4);
                        }
                        jsonReader.d();
                    }
                } else {
                    str = jsonReader.p();
                }
            }
            jsonReader.f();
            if (str2 != null) {
                com.airbnb.lottie.k kVar = new com.airbnb.lottie.k(i4, i5, str, str2, str3);
                map2.put(kVar.e(), kVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.d();
    }

    private static void c(JsonReader jsonReader, com.airbnb.lottie.g gVar, androidx.collection.m<com.airbnb.lottie.model.c> mVar) throws IOException {
        jsonReader.b();
        while (jsonReader.i()) {
            com.airbnb.lottie.model.c a4 = C1021m.a(jsonReader, gVar);
            mVar.p(a4.hashCode(), a4);
        }
        jsonReader.d();
    }

    private static void d(JsonReader jsonReader, Map<String, com.airbnb.lottie.model.b> map) throws IOException {
        jsonReader.c();
        while (jsonReader.i()) {
            if (jsonReader.A(f22006c) != 0) {
                jsonReader.D();
                jsonReader.F();
            } else {
                jsonReader.b();
                while (jsonReader.i()) {
                    com.airbnb.lottie.model.b a4 = C1022n.a(jsonReader);
                    map.put(a4.c(), a4);
                }
                jsonReader.d();
            }
        }
        jsonReader.f();
    }

    private static void e(JsonReader jsonReader, com.airbnb.lottie.g gVar, List<Layer> list, androidx.collection.h<Layer> hVar) throws IOException {
        jsonReader.b();
        int i4 = 0;
        while (jsonReader.i()) {
            Layer b4 = v.b(jsonReader, gVar);
            if (b4.f() == Layer.LayerType.IMAGE) {
                i4++;
            }
            list.add(b4);
            hVar.p(b4.d(), b4);
            if (i4 > 4) {
                com.airbnb.lottie.utils.f.e("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.d();
    }

    private static void f(JsonReader jsonReader, List<com.airbnb.lottie.model.g> list) throws IOException {
        jsonReader.b();
        while (jsonReader.i()) {
            jsonReader.c();
            float f4 = 0.0f;
            String str = null;
            float f5 = 0.0f;
            while (jsonReader.i()) {
                int A3 = jsonReader.A(f22007d);
                if (A3 != 0) {
                    if (A3 != 1) {
                        if (A3 != 2) {
                            jsonReader.D();
                            jsonReader.F();
                        } else {
                            f5 = (float) jsonReader.k();
                        }
                    } else {
                        f4 = (float) jsonReader.k();
                    }
                } else {
                    str = jsonReader.p();
                }
            }
            jsonReader.f();
            list.add(new com.airbnb.lottie.model.g(str, f4, f5));
        }
        jsonReader.d();
    }
}
