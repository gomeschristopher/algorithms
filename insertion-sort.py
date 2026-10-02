values = [64, 25, 10, 22, 11, 8]

for idx, x in enumerate(values):
    current_index = idx

    while current_index > 0:
        if(values[current_index - 1] > values[current_index]):
            values[current_index - 1], values[current_index] = values[current_index], values[current_index - 1]

        current_index -= 1

print(values)