/**
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.core.controllers.tracking.events.registration;

import android.support.annotation.NonNull;
import com.waz.zclient.core.controllers.tracking.attributes.Attribute;
import com.waz.zclient.core.controllers.tracking.events.Event;

// Temporary tracking to investigate high number of invite registrations AN-4117
public class OpenedPhoneRegistrationFromInviteEvent extends Event {

    public OpenedPhoneRegistrationFromInviteEvent(String referralToken, String userToken) {
        attributes.put(Attribute.REFERRAL_TOKEN, referralToken);
        attributes.put(Attribute.USER_TOKEN, userToken);
    }

    @NonNull
    @Override
    public String getName() {
        return "registration.opened_phone_registration_from_invite";
    }
}
