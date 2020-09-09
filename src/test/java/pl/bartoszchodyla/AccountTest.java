package pl.bartoszchodyla;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * Created by "Bartosz Chodyla" on 2020-09-09.
 */
class AccountTest {

    Account account = new Account();

    @Test
    void newlyCreatedAccountShouldNotBeActive() {

        //then
        assertThat(account.isActive(), equalTo(false));
    }

    @Test
    void accountShouldBeActiveAfterActivation() {

        //when
        account.activate();

        //then
        assertThat(account.isActive(),is(true));
    }
}
