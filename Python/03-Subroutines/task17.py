words = "You never get a second chance to make a first impression"


def letterInASentence(letter):
    count = 0
    for i in range(len(words)):
        if words[i] == letter:
            count += 1
    print(count)


letterInASentence('e')
