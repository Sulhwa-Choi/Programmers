package Level1;

import Level1.Example.*;

public class ServiceLevel1 {

    private final FindMiddleCharacter findMiddleCharacter = new FindMiddleCharacter();
    private final PlusNumber plusNumber = new PlusNumber();
    private final SecretMap secretMap = new SecretMap();
    private final StrangeStringReturn strangeStringReturn = new StrangeStringReturn();
    private final HallOfFame hallOfFame = new HallOfFame();

    public void findMiddlecharacter() {
        findMiddleCharacter.findMiddleCharacterIO();
    }
    public void secretMap() { secretMap.secretMapIO(); }
    public void strangeStringReturn() { strangeStringReturn.strangeStringReturnIO(); }
    public void plusNumber() { plusNumber.plusNumberIO(); }
    public void hallOfFame() { hallOfFame.hallOfFameIO(); }
}
