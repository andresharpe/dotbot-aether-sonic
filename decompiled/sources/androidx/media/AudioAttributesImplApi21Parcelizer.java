package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f15889a = (AudioAttributes) versionedParcel.W(audioAttributesImplApi21.f15889a, 1);
        audioAttributesImplApi21.f15890b = versionedParcel.M(audioAttributesImplApi21.f15890b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.X0(audioAttributesImplApi21.f15889a, 1);
        versionedParcel.M0(audioAttributesImplApi21.f15890b, 2);
    }
}
