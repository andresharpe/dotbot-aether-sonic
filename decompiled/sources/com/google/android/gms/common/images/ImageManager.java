package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C1244d;
import com.google.android.gms.common.internal.C1254i;
import com.google.android.gms.internal.base.k;
import com.google.android.gms.internal.base.p;
import com.google.android.gms.internal.base.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ImageManager {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f28559h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static HashSet<Uri> f28560i = new HashSet<>();

    /* renamed from: j, reason: collision with root package name */
    private static ImageManager f28561j;

    /* renamed from: a, reason: collision with root package name */
    private final Context f28562a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f28563b = new q(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f28564c = p.a().a(4, 2);

    /* renamed from: d, reason: collision with root package name */
    private final k f28565d = new k();

    /* renamed from: e, reason: collision with root package name */
    private final Map<i, ImageReceiver> f28566e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<Uri, ImageReceiver> f28567f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Map<Uri, Long> f28568g = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    @KeepName
    /* loaded from: classes.dex */
    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: E, reason: collision with root package name */
        private final Uri f28569E;

        /* renamed from: F, reason: collision with root package name */
        private final ArrayList<i> f28570F;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ImageReceiver(Uri uri) {
            super(new q(Looper.getMainLooper()));
            this.f28569E = uri;
            this.f28570F = new ArrayList<>();
        }

        public final void b(i iVar) {
            C1244d.a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f28570F.add(iVar);
        }

        public final void c(i iVar) {
            C1244d.a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f28570F.remove(iVar);
        }

        public final void d() {
            Intent intent = new Intent(C1254i.f28753c);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(C1254i.f28754d, this.f28569E);
            intent.putExtra(C1254i.f28755e, this);
            intent.putExtra(C1254i.f28756f, 3);
            ImageManager.this.f28562a.sendBroadcast(intent);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i4, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager imageManager = ImageManager.this;
            imageManager.f28564c.execute(new c(imageManager, this.f28569E, parcelFileDescriptor));
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(@N Uri uri, @P Drawable drawable, boolean z3);
    }

    private ImageManager(Context context, boolean z3) {
        this.f28562a = context.getApplicationContext();
    }

    @N
    public static ImageManager a(@N Context context) {
        if (f28561j == null) {
            f28561j = new ImageManager(context, false);
        }
        return f28561j;
    }

    public void b(@N ImageView imageView, int i4) {
        p(new g(imageView, i4));
    }

    public void c(@N ImageView imageView, @N Uri uri) {
        p(new g(imageView, uri));
    }

    public void d(@N ImageView imageView, @N Uri uri, int i4) {
        g gVar = new g(imageView, uri);
        gVar.f28591b = i4;
        p(gVar);
    }

    public void e(@N a aVar, @N Uri uri) {
        p(new h(aVar, uri));
    }

    public void f(@N a aVar, @N Uri uri, int i4) {
        h hVar = new h(aVar, uri);
        hVar.f28591b = i4;
        p(hVar);
    }

    public final void p(i iVar) {
        C1244d.a("ImageManager.loadImage() must be called in the main thread");
        new d(this, iVar).run();
    }
}
