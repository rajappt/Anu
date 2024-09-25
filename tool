working with the git tools
JAVA CODE IS RUNING IS JENIKES 
 public void PreProcessBMSBadMatchTable(char[] patternCharacters)
        {
            ShiftSizeTable.Clear();

            int totalCharacters = patternCharacters.Length;

            for (int lpIndex = 0; lpIndex < totalCharacters; lpIndex++)
            {
                //Calculate the shift size for each character in the string or char array.
                int ShiftSize = Math.Max(1, (totalCharacters - 1) - lpIndex);

                //If the charater is already exists in the ShiftSize table then replace it else add it to ShiftSize table.
                if (ShiftSizeTable.ContainsKey(patternCharacters[lpIndex]))
                {
                    ShiftSizeTable.Remove(patternCharacters[lpIndex]);
                }

                ShiftSizeTable.Add(patternCharacters[lpIndex], ShiftSize);
            }
        }
