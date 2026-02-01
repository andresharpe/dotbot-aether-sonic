package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.fragment.app.ActivityC0889g;
import com.bumptech.glide.c;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.engine.prefill.d;
import com.bumptech.glide.load.model.a;
import com.bumptech.glide.load.model.b;
import com.bumptech.glide.load.model.d;
import com.bumptech.glide.load.model.e;
import com.bumptech.glide.load.model.f;
import com.bumptech.glide.load.model.k;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.model.stream.b;
import com.bumptech.glide.load.model.stream.d;
import com.bumptech.glide.load.model.stream.e;
import com.bumptech.glide.load.model.stream.f;
import com.bumptech.glide.load.model.stream.i;
import com.bumptech.glide.load.model.t;
import com.bumptech.glide.load.model.u;
import com.bumptech.glide.load.model.v;
import com.bumptech.glide.load.model.w;
import com.bumptech.glide.load.model.x;
import com.bumptech.glide.load.resource.bitmap.A;
import com.bumptech.glide.load.resource.bitmap.C;
import com.bumptech.glide.load.resource.bitmap.C1116a;
import com.bumptech.glide.load.resource.bitmap.C1117b;
import com.bumptech.glide.load.resource.bitmap.C1120e;
import com.bumptech.glide.load.resource.bitmap.C1125j;
import com.bumptech.glide.load.resource.bitmap.C1127l;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.E;
import com.bumptech.glide.load.resource.bitmap.G;
import com.bumptech.glide.load.resource.bitmap.J;
import com.bumptech.glide.load.resource.bitmap.L;
import com.bumptech.glide.load.resource.bitmap.O;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.l;
import com.bumptech.glide.util.n;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t0.C2412a;
import u0.C2421a;

/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: Q, reason: collision with root package name */
    private static final String f25369Q = "image_manager_disk_cache";

    /* renamed from: R, reason: collision with root package name */
    private static final String f25370R = "Glide";

    /* renamed from: S, reason: collision with root package name */
    @B("Glide.class")
    private static volatile b f25371S;

    /* renamed from: T, reason: collision with root package name */
    private static volatile boolean f25372T;

    /* renamed from: E, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.k f25373E;

    /* renamed from: F, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f25374F;

    /* renamed from: G, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f25375G;

    /* renamed from: H, reason: collision with root package name */
    private final d f25376H;

    /* renamed from: I, reason: collision with root package name */
    private final Registry f25377I;

    /* renamed from: J, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f25378J;

    /* renamed from: K, reason: collision with root package name */
    private final q f25379K;

    /* renamed from: L, reason: collision with root package name */
    private final com.bumptech.glide.manager.d f25380L;

    /* renamed from: N, reason: collision with root package name */
    private final a f25382N;

    /* renamed from: P, reason: collision with root package name */
    @P
    @B("this")
    private com.bumptech.glide.load.engine.prefill.b f25384P;

    /* renamed from: M, reason: collision with root package name */
    @B("managers")
    private final List<j> f25381M = new ArrayList();

    /* renamed from: O, reason: collision with root package name */
    private MemoryCategory f25383O = MemoryCategory.NORMAL;

    /* loaded from: classes.dex */
    public interface a {
        @N
        com.bumptech.glide.request.h a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(@N Context context, @N com.bumptech.glide.load.engine.k kVar, @N com.bumptech.glide.load.engine.cache.j jVar, @N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @N q qVar, @N com.bumptech.glide.manager.d dVar, int i4, @N a aVar, @N Map<Class<?>, k<?, ?>> map, @N List<com.bumptech.glide.request.g<Object>> list, e eVar2) {
        com.bumptech.glide.load.g c1125j;
        com.bumptech.glide.load.g j4;
        Registry registry;
        this.f25373E = kVar;
        this.f25374F = eVar;
        this.f25378J = bVar;
        this.f25375G = jVar;
        this.f25379K = qVar;
        this.f25380L = dVar;
        this.f25382N = aVar;
        Resources resources = context.getResources();
        Registry registry2 = new Registry();
        this.f25377I = registry2;
        registry2.t(new DefaultImageHeaderParser());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 27) {
            registry2.t(new x());
        }
        List<ImageHeaderParser> g4 = registry2.g();
        com.bumptech.glide.load.resource.gif.a aVar2 = new com.bumptech.glide.load.resource.gif.a(context, g4, eVar, bVar);
        com.bumptech.glide.load.g<ParcelFileDescriptor, Bitmap> h4 = O.h(eVar);
        u uVar = new u(registry2.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (eVar2.b(c.C0219c.class) && i5 >= 28) {
            j4 = new C();
            c1125j = new C1127l();
        } else {
            c1125j = new C1125j(uVar);
            j4 = new J(uVar, bVar);
        }
        com.bumptech.glide.load.resource.drawable.e eVar3 = new com.bumptech.glide.load.resource.drawable.e(context);
        s.c cVar = new s.c(resources);
        s.d dVar2 = new s.d(resources);
        s.b bVar2 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        C1120e c1120e = new C1120e(bVar);
        com.bumptech.glide.load.resource.transcode.a aVar4 = new com.bumptech.glide.load.resource.transcode.a();
        com.bumptech.glide.load.resource.transcode.d dVar3 = new com.bumptech.glide.load.resource.transcode.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry2.a(ByteBuffer.class, new com.bumptech.glide.load.model.c()).a(InputStream.class, new t(bVar)).e(Registry.f25355l, ByteBuffer.class, Bitmap.class, c1125j).e(Registry.f25355l, InputStream.class, Bitmap.class, j4);
        if (ParcelFileDescriptorRewinder.c()) {
            registry2.e(Registry.f25355l, ParcelFileDescriptor.class, Bitmap.class, new E(uVar));
        }
        registry2.e(Registry.f25355l, ParcelFileDescriptor.class, Bitmap.class, h4).e(Registry.f25355l, AssetFileDescriptor.class, Bitmap.class, O.c(eVar)).d(Bitmap.class, Bitmap.class, v.a.b()).e(Registry.f25355l, Bitmap.class, Bitmap.class, new L()).b(Bitmap.class, c1120e).e(Registry.f25356m, ByteBuffer.class, BitmapDrawable.class, new C1116a(resources, c1125j)).e(Registry.f25356m, InputStream.class, BitmapDrawable.class, new C1116a(resources, j4)).e(Registry.f25356m, ParcelFileDescriptor.class, BitmapDrawable.class, new C1116a(resources, h4)).b(BitmapDrawable.class, new C1117b(eVar, c1120e)).e(Registry.f25354k, InputStream.class, com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.j(g4, aVar2, bVar)).e(Registry.f25354k, ByteBuffer.class, com.bumptech.glide.load.resource.gif.c.class, aVar2).b(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.d()).d(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, v.a.b()).e(Registry.f25355l, com.bumptech.glide.gifdecoder.a.class, Bitmap.class, new com.bumptech.glide.load.resource.gif.h(eVar)).c(Uri.class, Drawable.class, eVar3).c(Uri.class, Bitmap.class, new G(eVar3, eVar)).u(new C2412a.C0545a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new f.e()).c(File.class, File.class, new C2421a()).d(File.class, ParcelFileDescriptor.class, new f.b()).d(File.class, File.class, v.a.b()).u(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            registry = registry2;
            registry.u(new ParcelFileDescriptorRewinder.a());
        } else {
            registry = registry2;
        }
        Class cls = Integer.TYPE;
        registry.d(cls, InputStream.class, cVar).d(cls, ParcelFileDescriptor.class, bVar2).d(Integer.class, InputStream.class, cVar).d(Integer.class, ParcelFileDescriptor.class, bVar2).d(Integer.class, Uri.class, dVar2).d(cls, AssetFileDescriptor.class, aVar3).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls, Uri.class, dVar2).d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new u.c()).d(String.class, ParcelFileDescriptor.class, new u.b()).d(String.class, AssetFileDescriptor.class, new u.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new d.a(context)).d(Uri.class, InputStream.class, new e.a(context));
        if (i5 >= 29) {
            registry.d(Uri.class, InputStream.class, new f.c(context));
            registry.d(Uri.class, ParcelFileDescriptor.class, new f.b(context));
        }
        registry.d(Uri.class, InputStream.class, new w.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver)).d(Uri.class, InputStream.class, new x.a()).d(URL.class, InputStream.class, new i.a()).d(Uri.class, File.class, new k.a(context)).d(com.bumptech.glide.load.model.g.class, InputStream.class, new b.a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, v.a.b()).d(Drawable.class, Drawable.class, v.a.b()).c(Drawable.class, Drawable.class, new com.bumptech.glide.load.resource.drawable.f()).x(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.transcode.b(resources)).x(Bitmap.class, byte[].class, aVar4).x(Drawable.class, byte[].class, new com.bumptech.glide.load.resource.transcode.c(eVar, aVar4, dVar3)).x(com.bumptech.glide.load.resource.gif.c.class, byte[].class, dVar3);
        com.bumptech.glide.load.g<ByteBuffer, Bitmap> d4 = O.d(eVar);
        registry.c(ByteBuffer.class, Bitmap.class, d4);
        registry.c(ByteBuffer.class, BitmapDrawable.class, new C1116a(resources, d4));
        this.f25376H = new d(context, bVar, registry, new com.bumptech.glide.request.target.k(), aVar, map, list, kVar, eVar2, i4);
    }

    @N
    public static j C(@N Activity activity) {
        return p(activity).j(activity);
    }

    @N
    @Deprecated
    public static j D(@N Fragment fragment) {
        return p(fragment.getActivity()).k(fragment);
    }

    @N
    public static j E(@N Context context) {
        return p(context).l(context);
    }

    @N
    public static j F(@N View view) {
        return p(view.getContext()).m(view);
    }

    @N
    public static j G(@N androidx.fragment.app.Fragment fragment) {
        return p(fragment.getContext()).n(fragment);
    }

    @N
    public static j H(@N ActivityC0889g activityC0889g) {
        return p(activityC0889g).o(activityC0889g);
    }

    @B("Glide.class")
    private static void a(@N Context context, @P GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f25372T) {
            f25372T = true;
            s(context, generatedAppGlideModule);
            f25372T = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @i0
    public static void d() {
        A.d().l();
    }

    @N
    public static b e(@N Context context) {
        if (f25371S == null) {
            GeneratedAppGlideModule f4 = f(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f25371S == null) {
                        a(context, f4);
                    }
                } finally {
                }
            }
        }
        return f25371S;
    }

    @P
    private static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable(f25370R, 5)) {
                Log.w(f25370R, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e4) {
            z(e4);
            return null;
        } catch (InstantiationException e5) {
            z(e5);
            return null;
        } catch (NoSuchMethodException e6) {
            z(e6);
            return null;
        } catch (InvocationTargetException e7) {
            z(e7);
            return null;
        }
    }

    @P
    public static File l(@N Context context) {
        return m(context, "image_manager_disk_cache");
    }

    @P
    public static File m(@N Context context, @N String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (!file.isDirectory() && !file.mkdirs()) {
                return null;
            }
            return file;
        }
        if (Log.isLoggable(f25370R, 6)) {
            Log.e(f25370R, "default disk cache dir is null");
        }
        return null;
    }

    @N
    private static q p(@P Context context) {
        l.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return e(context).o();
    }

    @i0
    public static void q(@N Context context, @N c cVar) {
        GeneratedAppGlideModule f4 = f(context);
        synchronized (b.class) {
            try {
                if (f25371S != null) {
                    y();
                }
                t(context, cVar, f4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @i0
    @Deprecated
    public static synchronized void r(b bVar) {
        synchronized (b.class) {
            try {
                if (f25371S != null) {
                    y();
                }
                f25371S = bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @B("Glide.class")
    private static void s(@N Context context, @P GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new c(), generatedAppGlideModule);
    }

    @B("Glide.class")
    private static void t(@N Context context, @N c cVar, @P GeneratedAppGlideModule generatedAppGlideModule) {
        q.b bVar;
        Context applicationContext = context.getApplicationContext();
        List<com.bumptech.glide.module.c> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new com.bumptech.glide.module.e(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d4 = generatedAppGlideModule.d();
            Iterator<com.bumptech.glide.module.c> it = emptyList.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.module.c next = it.next();
                if (d4.contains(next.getClass())) {
                    if (Log.isLoggable(f25370R, 3)) {
                        Log.d(f25370R, "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(f25370R, 3)) {
            Iterator<com.bumptech.glide.module.c> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d(f25370R, "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            bVar = generatedAppGlideModule.e();
        } else {
            bVar = null;
        }
        cVar.t(bVar);
        Iterator<com.bumptech.glide.module.c> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, cVar);
        }
        b b4 = cVar.b(applicationContext);
        for (com.bumptech.glide.module.c cVar2 : emptyList) {
            try {
                cVar2.b(applicationContext, b4, b4.f25377I);
            } catch (AbstractMethodError e4) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + cVar2.getClass().getName(), e4);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, b4, b4.f25377I);
        }
        applicationContext.registerComponentCallbacks(b4);
        f25371S = b4;
    }

    @i0
    public static void y() {
        synchronized (b.class) {
            try {
                if (f25371S != null) {
                    f25371S.j().getApplicationContext().unregisterComponentCallbacks(f25371S);
                    f25371S.f25373E.m();
                }
                f25371S = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void z(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public void A(int i4) {
        n.b();
        synchronized (this.f25381M) {
            try {
                Iterator<j> it = this.f25381M.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f25375G.a(i4);
        this.f25374F.a(i4);
        this.f25378J.a(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(j jVar) {
        synchronized (this.f25381M) {
            try {
                if (this.f25381M.contains(jVar)) {
                    this.f25381M.remove(jVar);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        n.a();
        this.f25373E.e();
    }

    public void c() {
        n.b();
        this.f25375G.b();
        this.f25374F.b();
        this.f25378J.b();
    }

    @N
    public com.bumptech.glide.load.engine.bitmap_recycle.b g() {
        return this.f25378J;
    }

    @N
    public com.bumptech.glide.load.engine.bitmap_recycle.e h() {
        return this.f25374F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.manager.d i() {
        return this.f25380L;
    }

    @N
    public Context j() {
        return this.f25376H.getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public d k() {
        return this.f25376H;
    }

    @N
    public Registry n() {
        return this.f25377I;
    }

    @N
    public q o() {
        return this.f25379K;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        A(i4);
    }

    public synchronized void u(@N d.a... aVarArr) {
        try {
            if (this.f25384P == null) {
                this.f25384P = new com.bumptech.glide.load.engine.prefill.b(this.f25375G, this.f25374F, (DecodeFormat) this.f25382N.a().O().c(com.bumptech.glide.load.resource.bitmap.u.f26533g));
            }
            this.f25384P.c(aVarArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(j jVar) {
        synchronized (this.f25381M) {
            try {
                if (!this.f25381M.contains(jVar)) {
                    this.f25381M.add(jVar);
                } else {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w(@N p<?> pVar) {
        synchronized (this.f25381M) {
            try {
                Iterator<j> it = this.f25381M.iterator();
                while (it.hasNext()) {
                    if (it.next().c0(pVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @N
    public MemoryCategory x(@N MemoryCategory memoryCategory) {
        n.b();
        this.f25375G.c(memoryCategory.b());
        this.f25374F.c(memoryCategory.b());
        MemoryCategory memoryCategory2 = this.f25383O;
        this.f25383O = memoryCategory;
        return memoryCategory2;
    }
}
