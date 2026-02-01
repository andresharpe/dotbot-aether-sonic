package com.google.firebase.crashlytics.internal.model.serialization;

import N0.a;
import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.N;
import androidx.constraintlayout.core.motion.utils.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.model.A;
import com.google.firebase.crashlytics.internal.model.C1814a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.remoteconfig.u;
import com.spotify.android.appremote.internal.l;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a */
    private static final com.google.firebase.encoders.a f35577a = new com.google.firebase.encoders.json.e().k(C1814a.f35276b).l(true).j();

    /* loaded from: classes2.dex */
    public interface a<T> {
        T a(@N JsonReader jsonReader) throws IOException;
    }

    @N
    private static CrashlyticsReport.e A(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.e.a a4 = CrashlyticsReport.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("files")) {
                if (!nextName.equals("orgId")) {
                    jsonReader.skipValue();
                } else {
                    a4.c(jsonReader.nextString());
                }
            } else {
                a4.b(m(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.f
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.g.a
                    public final Object a(JsonReader jsonReader2) {
                        CrashlyticsReport.e.b z3;
                        z3 = g.z(jsonReader2);
                        return z3;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport.f.e B(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.e.a a4 = CrashlyticsReport.f.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c4 = 3;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.b(jsonReader.nextString());
                    break;
                case 1:
                    a4.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a4.e(jsonReader.nextString());
                    break;
                case 3:
                    a4.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport C(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.c b4 = CrashlyticsReport.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals(u.b.f37788f0)) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c4 = 7;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    b4.f(A(jsonReader));
                    break;
                case 1:
                    b4.h(jsonReader.nextString());
                    break;
                case 2:
                    b4.b(jsonReader.nextString());
                    break;
                case 3:
                    b4.d(jsonReader.nextString());
                    break;
                case 4:
                    b4.e(jsonReader.nextString());
                    break;
                case 5:
                    b4.g(jsonReader.nextInt());
                    break;
                case 6:
                    b4.c(jsonReader.nextString());
                    break;
                case 7:
                    b4.i(D(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    @N
    private static CrashlyticsReport.f D(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.b a4 = CrashlyticsReport.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(l.f48821i)) {
                        c4 = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c4 = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c4 = '\b';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c4 = '\t';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c4 = '\n';
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.l(jsonReader.nextLong());
                    break;
                case 1:
                    a4.j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a4.e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a4.d(o(jsonReader));
                    break;
                case 4:
                    a4.f(m(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.c
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.g.a
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.f.d p4;
                            p4 = g.p(jsonReader2);
                            return p4;
                        }
                    }));
                    break;
                case 5:
                    a4.k(B(jsonReader));
                    break;
                case 6:
                    a4.b(k(jsonReader));
                    break;
                case 7:
                    a4.m(E(jsonReader));
                    break;
                case '\b':
                    a4.g(jsonReader.nextString());
                    break;
                case '\t':
                    a4.c(jsonReader.nextBoolean());
                    break;
                case '\n':
                    a4.h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    @N
    private static CrashlyticsReport.f.AbstractC0328f E(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.AbstractC0328f.a a4 = CrashlyticsReport.f.AbstractC0328f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a4.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport.f.a k(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.a.AbstractC0315a a4 = CrashlyticsReport.f.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c4 = 5;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.e(jsonReader.nextString());
                    break;
                case 1:
                    a4.b(jsonReader.nextString());
                    break;
                case 2:
                    a4.c(jsonReader.nextString());
                    break;
                case 3:
                    a4.h(jsonReader.nextString());
                    break;
                case 4:
                    a4.f(jsonReader.nextString());
                    break;
                case 5:
                    a4.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport.a l(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.a.AbstractC0314a a4 = CrashlyticsReport.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c4 = 7;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.c(jsonReader.nextInt());
                    break;
                case 1:
                    a4.e(jsonReader.nextLong());
                    break;
                case 2:
                    a4.g(jsonReader.nextLong());
                    break;
                case 3:
                    a4.h(jsonReader.nextLong());
                    break;
                case 4:
                    a4.d(jsonReader.nextString());
                    break;
                case 5:
                    a4.f(jsonReader.nextInt());
                    break;
                case 6:
                    a4.i(jsonReader.nextString());
                    break;
                case 7:
                    a4.b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    @N
    private static <T> A<T> m(@N JsonReader jsonReader, @N a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return A.b(arrayList);
    }

    @N
    public static CrashlyticsReport.d n(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.d.a a4 = CrashlyticsReport.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    a4.c(jsonReader.nextString());
                }
            } else {
                a4.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport.f.c o(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.c.a a4 = CrashlyticsReport.f.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c4 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c4 = '\b';
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a4.e(jsonReader.nextString());
                    break;
                case 2:
                    a4.h(jsonReader.nextLong());
                    break;
                case 3:
                    a4.b(jsonReader.nextInt());
                    break;
                case 4:
                    a4.d(jsonReader.nextLong());
                    break;
                case 5:
                    a4.c(jsonReader.nextInt());
                    break;
                case 6:
                    a4.f(jsonReader.nextString());
                    break;
                case 7:
                    a4.j(jsonReader.nextInt());
                    break;
                case '\b':
                    a4.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    public static CrashlyticsReport.f.d p(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.b a4 = CrashlyticsReport.f.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(l.f48821i)) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c4 = 4;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.c(s(jsonReader));
                    break;
                case 1:
                    a4.b(q(jsonReader));
                    break;
                case 2:
                    a4.d(w(jsonReader));
                    break;
                case 3:
                    a4.f(jsonReader.nextString());
                    break;
                case 4:
                    a4.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport.f.d.a q(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.a.AbstractC0317a a4 = CrashlyticsReport.f.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c4 = 4;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a4.d(t(jsonReader));
                    break;
                case 2:
                    a4.e(m(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.b
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.g.a
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.d n4;
                            n4 = g.n(jsonReader2);
                            return n4;
                        }
                    }));
                    break;
                case 3:
                    a4.c(m(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.b
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.g.a
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.d n4;
                            n4 = g.n(jsonReader2);
                            return n4;
                        }
                    }));
                    break;
                case 4:
                    a4.f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    @N
    public static CrashlyticsReport.f.d.a.b.AbstractC0318a r(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a a4 = CrashlyticsReport.f.d.a.b.AbstractC0318a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(a.C0015a.f1688b)) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c4 = 3;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.c(jsonReader.nextString());
                    break;
                case 1:
                    a4.d(jsonReader.nextLong());
                    break;
                case 2:
                    a4.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a4.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport.f.d.c s(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.c.a a4 = CrashlyticsReport.f.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c4 = 5;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a4.c(jsonReader.nextInt());
                    break;
                case 2:
                    a4.e(jsonReader.nextInt());
                    break;
                case 3:
                    a4.d(jsonReader.nextLong());
                    break;
                case 4:
                    a4.g(jsonReader.nextLong());
                    break;
                case 5:
                    a4.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport.f.d.a.b t(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.a.b.AbstractC0320b a4 = CrashlyticsReport.f.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c4 = 4;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.b(l(jsonReader));
                    break;
                case 1:
                    a4.f(m(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.d
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.g.a
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.f.d.a.b.e y3;
                            y3 = g.y(jsonReader2);
                            return y3;
                        }
                    }));
                    break;
                case 2:
                    a4.e(x(jsonReader));
                    break;
                case 3:
                    a4.c(m(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.e
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.g.a
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.f.d.a.b.AbstractC0318a r4;
                            r4 = g.r(jsonReader2);
                            return r4;
                        }
                    }));
                    break;
                case 4:
                    a4.d(u(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport.f.d.a.b.c u(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.a.b.c.AbstractC0321a a4 = CrashlyticsReport.f.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c4 = 4;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.c(m(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a()));
                    break;
                case 1:
                    a4.e(jsonReader.nextString());
                    break;
                case 2:
                    a4.f(jsonReader.nextString());
                    break;
                case 3:
                    a4.b(u(jsonReader));
                    break;
                case 4:
                    a4.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    public static CrashlyticsReport.f.d.a.b.e.AbstractC0325b v(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a a4 = CrashlyticsReport.f.d.a.b.e.AbstractC0325b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(v.c.f7432R)) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c4 = 4;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.d(jsonReader.nextLong());
                    break;
                case 1:
                    a4.f(jsonReader.nextString());
                    break;
                case 2:
                    a4.e(jsonReader.nextLong());
                    break;
                case 3:
                    a4.b(jsonReader.nextString());
                    break;
                case 4:
                    a4.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    @N
    private static CrashlyticsReport.f.d.AbstractC0327d w(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.AbstractC0327d.a a4 = CrashlyticsReport.f.d.AbstractC0327d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals(FirebaseAnalytics.b.f34769P)) {
                jsonReader.skipValue();
            } else {
                a4.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    private static CrashlyticsReport.f.d.a.b.AbstractC0322d x(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.a.b.AbstractC0322d.AbstractC0323a a4 = CrashlyticsReport.f.d.a.b.AbstractC0322d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals(com.spotify.sdk.android.auth.a.f48965k)) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(a.C0015a.f1688b)) {
                        c4 = 2;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.b(jsonReader.nextLong());
                    break;
                case 1:
                    a4.c(jsonReader.nextString());
                    break;
                case 2:
                    a4.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @N
    public static CrashlyticsReport.f.d.a.b.e y(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.a.b.e.AbstractC0324a a4 = CrashlyticsReport.f.d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c4 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(a.C0015a.f1688b)) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c4 = 2;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a4.b(m(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a()));
                    break;
                case 1:
                    a4.d(jsonReader.nextString());
                    break;
                case 2:
                    a4.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    @N
    public static CrashlyticsReport.e.b z(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.e.b.a a4 = CrashlyticsReport.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("filename")) {
                if (!nextName.equals("contents")) {
                    jsonReader.skipValue();
                } else {
                    a4.b(Base64.decode(jsonReader.nextString(), 2));
                }
            } else {
                a4.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a4.a();
    }

    @N
    public CrashlyticsReport F(@N String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport C3 = C(jsonReader);
                jsonReader.close();
                return C3;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }

    @N
    public String G(@N CrashlyticsReport crashlyticsReport) {
        return f35577a.b(crashlyticsReport);
    }

    @N
    public CrashlyticsReport.a g(@N String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport.a l4 = l(jsonReader);
                jsonReader.close();
                return l4;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }

    @N
    public String h(@N CrashlyticsReport.a aVar) {
        return f35577a.b(aVar);
    }

    @N
    public CrashlyticsReport.f.d i(@N String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport.f.d p4 = p(jsonReader);
                jsonReader.close();
                return p4;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }

    @N
    public String j(@N CrashlyticsReport.f.d dVar) {
        return f35577a.b(dVar);
    }
}
