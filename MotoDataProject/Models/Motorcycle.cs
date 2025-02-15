using System.ComponentModel.DataAnnotations;
using System.Globalization;

namespace MotoDataProject.Models
{
    public class Motorcycle
    {
        [Key]
        public Guid Id { get; set; }
        [Required]
        [MaxLength(50)]
        public String Brand { get; set; }
        [MaxLength(50)]
        [Required]
        public String Model { get; set; }
        [Required]
        public double Current_km { get; set; }
        [Required]
        public double Total_Km {get; set;}

    }
}
