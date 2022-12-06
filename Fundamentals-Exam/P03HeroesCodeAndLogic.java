import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03HeroesCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap <String, Integer> heroHitMap = new LinkedHashMap<>();
        LinkedHashMap <String, Integer> heroManaMap = new LinkedHashMap<>();

        for (int countHero = 0; countHero < n; countHero++) {
            String infoHero = scanner.nextLine();
            String hero = infoHero.split(" ")[0];
            int hitPoint = Integer.parseInt(infoHero.split(" ")[1]);
            int manaPoint = Integer.parseInt(infoHero.split(" ")[2]);

            heroHitMap.put(hero, hitPoint);
            heroManaMap.put(hero, manaPoint);
        }

        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("End")) {
            String [] inputArr = inputCommand.split(" - ");
            String command = inputArr[0];
            String hero = inputArr[1];

            int currentMP = heroManaMap.get(hero);
            int currentHP = heroHitMap.get(hero);

            switch (command) {
                case "CastSpell":
                    int MPneeded = Integer.parseInt(inputArr[2]);
                    String spellName = inputArr[3];

                    if (currentMP >= MPneeded) {
                        currentMP -= MPneeded;
                        heroManaMap.put(hero, currentMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, spellName, currentMP);

                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", hero, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(inputArr[2]);
                    String attacker = inputArr[3];
                       currentHP -= damage;

                       if (currentHP > 0) {
                           heroHitMap.put(hero, currentHP);
                           System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", hero, damage, attacker, currentHP);
                       } else {
                           heroHitMap.remove(hero);
                           heroManaMap.remove(hero);
                           System.out.printf("%s has been killed by %s!%n", hero, attacker);
                       }
                    break;

                case "Recharge":
                    int amountMP = Integer.parseInt(inputArr[2]);

                    currentMP += amountMP;
                    if (currentMP > 200) {
                        amountMP = 200 - (currentMP - amountMP);
                        currentMP = 200;
                    }

                    heroManaMap.put(hero, currentMP);
                    System.out.printf("%s recharged for %d MP!%n",hero, amountMP);
                    break;

                case "Heal":
                    int amountHP = Integer.parseInt(inputArr[2]);

                    currentHP += amountHP;
                    if (currentHP > 100) {
                        amountHP =100 - (currentHP - amountHP);
                        currentHP = 100;
                    }

                    heroHitMap.put(hero, currentHP);
                    System.out.printf("%s healed for %d HP!%n",hero, amountHP);
                    break;
            }

            inputCommand = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : heroHitMap.entrySet()) {
            System.out.printf("%s%n HP: %d%n MP: %d%n", entry.getKey(),entry.getValue(), heroManaMap.get(entry.getKey()));
        }

    }
}
