    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        
        assertEquals("Expected isAdult to be true for age 19", true, isAdult);
    }
