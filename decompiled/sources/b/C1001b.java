package b;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import androidx.core.content.C0669d;
import b.AbstractC1000a;
import com.google.firebase.messaging.C1821f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.C2122h0;
import kotlin.InterfaceC2205l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.V;
import kotlin.collections.C2101p;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.collections.X;
import kotlin.collections.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.ranges.u;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001b {

    @W(33)
    /* renamed from: b.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f20924a = new a();

        private a() {
        }

        @InterfaceC0577u
        public final int a() {
            return MediaStore.getPickImagesMaxLimit();
        }
    }

    /* renamed from: b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0191b extends AbstractC1000a<Uri, Boolean> {
        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d Uri input) {
            F.p(context, "context");
            F.p(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            F.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<Boolean> b(@l3.d Context context, @l3.d Uri input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i4, @l3.e Intent intent) {
            boolean z3;
            if (i4 == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* renamed from: b.b$d */
    /* loaded from: classes.dex */
    public static class d extends AbstractC1000a<String, Uri> {
        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d String input) {
            F.p(context, "context");
            F.p(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            F.o(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<Uri> b(@l3.d Context context, @l3.d String input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i4, @l3.e Intent intent) {
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    @W(18)
    /* renamed from: b.b$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC1000a<String, List<Uri>> {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f20926a = new a(null);

        @W(18)
        /* renamed from: b.b$e$a */
        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            @l3.d
            public final List<Uri> a(@l3.d Intent intent) {
                List<Uri> H3;
                F.p(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    H3 = CollectionsKt__CollectionsKt.H();
                    return H3;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i4 = 0; i4 < itemCount; i4++) {
                        Uri uri = clipData.getItemAt(i4).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            private a() {
            }
        }

        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d String input) {
            F.p(context, "context");
            F.p(input, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            F.o(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<List<Uri>> b(@l3.d Context context, @l3.d String input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i4, @l3.e Intent intent) {
            List<Uri> H3;
            List<Uri> a4;
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null || (a4 = f20926a.a(intent)) == null) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            return a4;
        }
    }

    @W(19)
    /* renamed from: b.b$f */
    /* loaded from: classes.dex */
    public static class f extends AbstractC1000a<String[], Uri> {
        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d String[] input) {
            F.p(context, "context");
            F.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            F.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<Uri> b(@l3.d Context context, @l3.d String[] input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i4, @l3.e Intent intent) {
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    @W(21)
    /* renamed from: b.b$g */
    /* loaded from: classes.dex */
    public static class g extends AbstractC1000a<Uri, Uri> {
        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.e Uri uri) {
            F.p(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<Uri> b(@l3.d Context context, @l3.e Uri uri) {
            F.p(context, "context");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i4, @l3.e Intent intent) {
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    @W(19)
    /* renamed from: b.b$h */
    /* loaded from: classes.dex */
    public static class h extends AbstractC1000a<String[], List<Uri>> {
        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d String[] input) {
            F.p(context, "context");
            F.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            F.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<List<Uri>> b(@l3.d Context context, @l3.d String[] input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i4, @l3.e Intent intent) {
            List<Uri> H3;
            List<Uri> a4;
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null || (a4 = e.f20926a.a(intent)) == null) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            return a4;
        }
    }

    /* renamed from: b.b$i */
    /* loaded from: classes.dex */
    public static final class i extends AbstractC1000a<Void, Uri> {
        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.e Void r22) {
            F.p(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            F.o(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri c(int i4, @l3.e Intent intent) {
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    @W(19)
    /* renamed from: b.b$j */
    /* loaded from: classes.dex */
    public static class j extends AbstractC1000a<androidx.activity.result.m, List<Uri>> {

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final a f20927b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final int f20928a;

        /* renamed from: b.b$j$a */
        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            public final int a() {
                if (k.f20929a.b() && Build.VERSION.SDK_INT >= 33) {
                    return a.f20924a.a();
                }
                return Integer.MAX_VALUE;
            }

            private a() {
            }
        }

        public j() {
            this(0, 1, null);
        }

        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d androidx.activity.result.m input) {
            Intent intent;
            F.p(context, "context");
            F.p(input, "input");
            k.a aVar = k.f20929a;
            if (aVar.b()) {
                intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.a(input.a()));
                if (Build.VERSION.SDK_INT >= 33 && this.f20928a > a.f20924a.a()) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f20928a);
            } else {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType(aVar.a(input.a()));
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent.getType() == null) {
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
            }
            return intent;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<List<Uri>> b(@l3.d Context context, @l3.d androidx.activity.result.m input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i4, @l3.e Intent intent) {
            List<Uri> H3;
            List<Uri> a4;
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null || (a4 = e.f20926a.a(intent)) == null) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            return a4;
        }

        public /* synthetic */ j(int i4, int i5, C2197u c2197u) {
            this((i5 & 1) != 0 ? f20927b.a() : i4);
        }

        public j(int i4) {
            this.f20928a = i4;
            if (i4 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }
    }

    /* renamed from: b.b$k */
    /* loaded from: classes.dex */
    public static class k extends AbstractC1000a<androidx.activity.result.m, Uri> {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f20929a = new a(null);

        /* renamed from: b.b$k$a */
        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            @l3.e
            public final String a(@l3.d f input) {
                F.p(input, "input");
                if (input instanceof c) {
                    return "image/*";
                }
                if (input instanceof e) {
                    return "video/*";
                }
                if (input instanceof d) {
                    return ((d) input).a();
                }
                if (input instanceof C0192b) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            @W2.n
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean b() {
                int extensionVersion;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    return true;
                }
                if (i4 >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion >= 2) {
                        return true;
                    }
                }
                return false;
            }

            private a() {
            }
        }

        /* renamed from: b.b$k$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0192b implements f {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            public static final C0192b f20930a = new C0192b();

            private C0192b() {
            }
        }

        /* renamed from: b.b$k$c */
        /* loaded from: classes.dex */
        public static final class c implements f {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            public static final c f20931a = new c();

            private c() {
            }
        }

        /* renamed from: b.b$k$d */
        /* loaded from: classes.dex */
        public static final class d implements f {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            private final String f20932a;

            public d(@l3.d String mimeType) {
                F.p(mimeType, "mimeType");
                this.f20932a = mimeType;
            }

            @l3.d
            public final String a() {
                return this.f20932a;
            }
        }

        /* renamed from: b.b$k$e */
        /* loaded from: classes.dex */
        public static final class e implements f {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            public static final e f20933a = new e();

            private e() {
            }
        }

        /* renamed from: b.b$k$f */
        /* loaded from: classes.dex */
        public interface f {
        }

        @W2.n
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean f() {
            return f20929a.b();
        }

        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d androidx.activity.result.m input) {
            F.p(context, "context");
            F.p(input, "input");
            a aVar = f20929a;
            if (aVar.b()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.a(input.a()));
                return intent;
            }
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(aVar.a(input.a()));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent2;
            }
            return intent2;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<Uri> b(@l3.d Context context, @l3.d androidx.activity.result.m input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i4, @l3.e Intent intent) {
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    /* renamed from: b.b$l */
    /* loaded from: classes.dex */
    public static final class l extends AbstractC1000a<String[], Map<String, Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f20934a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final String f20935b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        public static final String f20936c = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        public static final String f20937d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* renamed from: b.b$l$a */
        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            @l3.d
            public final Intent a(@l3.d String[] input) {
                F.p(input, "input");
                Intent putExtra = new Intent(l.f20935b).putExtra(l.f20936c, input);
                F.o(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }

            private a() {
            }
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d String[] input) {
            F.p(context, "context");
            F.p(input, "input");
            return f20934a.a(input);
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC1000a.C0190a<Map<String, Boolean>> b(@l3.d Context context, @l3.d String[] input) {
            int j4;
            int u3;
            Map z3;
            F.p(context, "context");
            F.p(input, "input");
            if (input.length == 0) {
                z3 = Y.z();
                return new AbstractC1000a.C0190a<>(z3);
            }
            for (String str : input) {
                if (C0669d.a(context, str) != 0) {
                    return null;
                }
            }
            j4 = X.j(input.length);
            u3 = u.u(j4, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
            for (String str2 : input) {
                Pair a4 = C2122h0.a(str2, Boolean.TRUE);
                linkedHashMap.put(a4.e(), a4.f());
            }
            return new AbstractC1000a.C0190a<>(linkedHashMap);
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> c(int i4, @l3.e Intent intent) {
            Map<String, Boolean> z3;
            List Ta;
            List i6;
            Map<String, Boolean> B02;
            boolean z4;
            Map<String, Boolean> z5;
            Map<String, Boolean> z6;
            if (i4 != -1) {
                z6 = Y.z();
                return z6;
            }
            if (intent == null) {
                z5 = Y.z();
                return z5;
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(f20936c);
            int[] intArrayExtra = intent.getIntArrayExtra(f20937d);
            if (intArrayExtra == null || stringArrayExtra == null) {
                z3 = Y.z();
                return z3;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i5 : intArrayExtra) {
                if (i5 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(Boolean.valueOf(z4));
            }
            Ta = C2101p.Ta(stringArrayExtra);
            i6 = D.i6(Ta, arrayList);
            B02 = Y.B0(i6);
            return B02;
        }
    }

    /* renamed from: b.b$m */
    /* loaded from: classes.dex */
    public static final class m extends AbstractC1000a<String, Boolean> {
        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d String input) {
            F.p(context, "context");
            F.p(input, "input");
            return l.f20934a.a(new String[]{input});
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC1000a.C0190a<Boolean> b(@l3.d Context context, @l3.d String input) {
            F.p(context, "context");
            F.p(input, "input");
            if (C0669d.a(context, input) == 0) {
                return new AbstractC1000a.C0190a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean c(int i4, @l3.e Intent intent) {
            if (intent != null && i4 == -1) {
                int[] intArrayExtra = intent.getIntArrayExtra(l.f20937d);
                boolean z3 = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (intArrayExtra[i5] == 0) {
                            z3 = true;
                            break;
                        }
                        i5++;
                    }
                }
                return Boolean.valueOf(z3);
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: b.b$n */
    /* loaded from: classes.dex */
    public static final class n extends AbstractC1000a<Intent, androidx.activity.result.a> {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f20938a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final String f20939b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* renamed from: b.b$n$a */
        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            private a() {
            }
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d Intent input) {
            F.p(context, "context");
            F.p(input, "input");
            return input;
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i4, @l3.e Intent intent) {
            return new androidx.activity.result.a(i4, intent);
        }
    }

    /* renamed from: b.b$o */
    /* loaded from: classes.dex */
    public static final class o extends AbstractC1000a<androidx.activity.result.l, androidx.activity.result.a> {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f20940a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final String f20941b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        public static final String f20942c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        public static final String f20943d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* renamed from: b.b$o$a */
        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            private a() {
            }
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d androidx.activity.result.l input) {
            F.p(context, "context");
            F.p(input, "input");
            Intent putExtra = new Intent(f20941b).putExtra(f20942c, input);
            F.o(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i4, @l3.e Intent intent) {
            return new androidx.activity.result.a(i4, intent);
        }
    }

    /* renamed from: b.b$p */
    /* loaded from: classes.dex */
    public static class p extends AbstractC1000a<Uri, Boolean> {
        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d Uri input) {
            F.p(context, "context");
            F.p(input, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            F.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<Boolean> b(@l3.d Context context, @l3.d Uri input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i4, @l3.e Intent intent) {
            boolean z3;
            if (i4 == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* renamed from: b.b$q */
    /* loaded from: classes.dex */
    public static class q extends AbstractC1000a<Void, Bitmap> {
        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.e Void r22) {
            F.p(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<Bitmap> b(@l3.d Context context, @l3.e Void r22) {
            F.p(context, "context");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i4, @l3.e Intent intent) {
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra(C1821f.C0339f.a.f37006R);
        }
    }

    @InterfaceC2205l(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    /* renamed from: b.b$r */
    /* loaded from: classes.dex */
    public static class r extends AbstractC1000a<Uri, Bitmap> {
        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d Uri input) {
            F.p(context, "context");
            F.p(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            F.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<Bitmap> b(@l3.d Context context, @l3.d Uri input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i4, @l3.e Intent intent) {
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra(C1821f.C0339f.a.f37006R);
        }
    }

    private C1001b() {
    }

    @W(19)
    /* renamed from: b.b$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC1000a<String, Uri> {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final String f20925a;

        public c(@l3.d String mimeType) {
            F.p(mimeType, "mimeType");
            this.f20925a = mimeType;
        }

        @Override // b.AbstractC1000a
        @InterfaceC0566i
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@l3.d Context context, @l3.d String input) {
            F.p(context, "context");
            F.p(input, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f20925a).putExtra("android.intent.extra.TITLE", input);
            F.o(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC1000a.C0190a<Uri> b(@l3.d Context context, @l3.d String input) {
            F.p(context, "context");
            F.p(input, "input");
            return null;
        }

        @Override // b.AbstractC1000a
        @l3.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i4, @l3.e Intent intent) {
            if (i4 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }

        @InterfaceC2205l(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @V(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public c() {
            this("*/*");
        }
    }
}
