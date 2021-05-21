input_line = gets.to_i
data = []
input_line.times do 
data << gets.chomp
end
input_line.times do |t|
    str = ""
    count = 0
    count_t = 0
    length = data[t].length + 1
    length.times do |u|
        if u == length -1 
            if 255 >= str.to_i && 0 <= str.to_i 
                str = ""
                count_t += 1
                break
            else
                count += 1
                break
            end
        
            
        elsif data[t][u] != "."
            str += data[t][u]
        
        else 
            if str.length >= 2 && str[0] == "0"
          
                count += 1
                break
      
            elsif str == ""
                count += 1
                break
            
            elsif 255 >= str.to_i && 0 <= str.to_i 
                str = ""
                count_t += 1
                if count_t == 5
       
          
                    break
                end
            else
             
                count += 1
                break
            end
        end
    end
    if count == 0 && count_t == 4
        puts "True"
    else
        puts "False"
    end

end

                
            
