package K0;

import android.os.Parcelable;
import androidx.annotation.N;

/* loaded from: classes.dex */
public interface c extends Parcelable {

    @N
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* loaded from: classes.dex */
    public @interface a {
        @N
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* loaded from: classes.dex */
    public @interface b {
    }

    /* renamed from: K0.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0014c {
        @N
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @N
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @N
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @N
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes.dex */
    public @interface d {
        @N
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes.dex */
    public @interface e {
        int id();
    }

    /* loaded from: classes.dex */
    public @interface f {
        @N
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @N
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* loaded from: classes.dex */
    public @interface g {
        @N
        int[] value();
    }

    /* loaded from: classes.dex */
    public @interface h {
        @N
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @N
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
