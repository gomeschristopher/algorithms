
values = [64, 25, 10, 22, 11]

for current_index, current in enumerate(values):
    min_index = current_index

    for idx in range (current_index, len(values)):
        if values[idx] < values[min_index]:
            min_index = idx


    values[current_index], values[min_index] = values[min_index], values[current_index]

print(values)
