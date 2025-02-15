using System;
using Microsoft.EntityFrameworkCore;
using MotoDataProject.Models;

namespace MotoDataProject
{
	public class ApplicationDBContext : DbContext
	{
		public ApplicationDBContext(DbContextOptions<ApplicationDBContext> options) : base(options)
		{
		}
		public DbSet<Motorcycle> Motorcycles => Set<Motorcycle>();
	
	}
}
	
