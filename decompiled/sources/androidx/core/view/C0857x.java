package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857x {

    /* renamed from: a, reason: collision with root package name */
    private final DragAndDropPermissions f13658a;

    @androidx.annotation.W(24)
    /* renamed from: androidx.core.view.x$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @InterfaceC0577u
        static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private C0857x(DragAndDropPermissions dragAndDropPermissions) {
        this.f13658a = dragAndDropPermissions;
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static C0857x b(@androidx.annotation.N Activity activity, @androidx.annotation.N DragEvent dragEvent) {
        DragAndDropPermissions b4 = a.b(activity, dragEvent);
        if (b4 != null) {
            return new C0857x(b4);
        }
        return null;
    }

    public void a() {
        a.a(this.f13658a);
    }
}
